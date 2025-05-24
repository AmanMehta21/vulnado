package com.scalesec.vulnado;

import org.apache.catalina.Server;
import java.sql.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Comment {
  No specific fix available for this issue type
  No specific fix available for this issue type

  No specific fix available for this issue type
    this.id = id;
    this.username = username;
    this.body = body;
    this.created_on = created_on;
  }

  public static Comment create(String username, String body){
    long time = new Date().getTime();
    Timestamp timestamp = new Timestamp(time);
    Comment comment = new Comment(UUID.randomUUID().toString(), username, body, timestamp);
    try {
      No specific fix available for this issue type
        return comment;
      } else {
        throw new BadRequest("Unable to save comment");
      }
    } catch (Exception e) {
      throw new ServerError(e.getMessage());
    }
  }

  No specific fix available for this issue type
    Statement stmt = null;
    No specific fix available for this issue type
    try {
      Connection cxn = Postgres.connection();
      No specific fix available for this issue type

      No specific fix available for this issue type
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        String id = rs.getString("id");
        String username = rs.getString("username");
        String body = rs.getString("body");
        No specific fix available for this issue type
        Comment c = new Comment(id, username, body, created_on);
        comments.add(c);
      }
      cxn.close();
    } catch (Exception e) {
      e.printStackTrace();
      No specific fix available for this issue type
    } finally {
      No specific fix available for this issue type
    }
  }

  No specific fix available for this issue type
    try {
      String sql = "DELETE FROM comments where id = ?";
      Connection con = Postgres.connection();
      No specific fix available for this issue type
      pStatement.setString(1, id);
      return 1 == pStatement.executeUpdate();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      No specific fix available for this issue type
    }
  }

  private Boolean commit() throws SQLException {
    String sql = "INSERT INTO comments (id, username, body, created_on) VALUES (?,?,?,?)";
    Connection con = Postgres.connection();
    No specific fix available for this issue type
    pStatement.setString(1, this.id);
    pStatement.setString(2, this.username);
    pStatement.setString(3, this.body);
    pStatement.setTimestamp(4, this.created_on);
    return 1 == pStatement.executeUpdate();
  }
}