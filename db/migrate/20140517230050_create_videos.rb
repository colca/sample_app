class CreateVideos < ActiveRecord::Migration
  def change
    create_table :videos, {:id => false} do |t|
      t.string :vid, :limit => 1000 
      t.string :etag, :limit => 1000 
      t.timestamps :published_at
      t.string :channel_id
      t.text :thumbnails_default
      t.text :thumbnails_medium
      t.text :thumbnails_high
      t.text :thumbnails_standard
      t.string :channel_title
      t.integer :youtube_category_id
      t.integer :view_count
      t.integer :like_count
      t.integer :dislike_count
      t.integer :favorite_count
      t.integer :comment_count
      t.string  :embed_html, :limit => 3000
      t.string  :title, :limit => 1000
      t.text    :description
      t.string  :category
      t.string  :dancer
      t.float   :heuristic
      t.integer :relevance 
      t.integer :dancer_id
      t.integer :category_id

      t.timestamps
    end
 
    add_index :videos, :heuristic
    add_index :videos, :relevance
    add_index :videos, :dancer_id
    add_index :videos, :category_id

  end
end
