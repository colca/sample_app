# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended to check this file into your version control system.

ActiveRecord::Schema.define(:version => 20140518170542) do

  create_table "categories", :force => true do |t|
    t.string   "cName"
    t.datetime "created_at", :null => false
    t.datetime "updated_at", :null => false
  end

  add_index "categories", ["cName"], :name => "index_categories_on_cName", :unique => true

  create_table "dancers", :force => true do |t|
    t.string  "name"
    t.integer "category_id"
  end

  add_index "dancers", ["category_id"], :name => "index_dancers_on_category_id"

  create_table "microposts", :force => true do |t|
    t.string   "content"
    t.integer  "user_id"
    t.datetime "created_at", :null => false
    t.datetime "updated_at", :null => false
  end

  add_index "microposts", ["user_id", "created_at"], :name => "index_microposts_on_user_id_and_created_at"

  create_table "popsicles", :primary_key => "pop_id", :force => true do |t|
    t.string  "flavor", :limit => 50, :null => false
    t.integer "amount",               :null => false
    t.string  "size",   :limit => 10
  end

  create_table "relationships", :force => true do |t|
    t.integer  "follower_id"
    t.integer  "followed_id"
    t.datetime "created_at",  :null => false
    t.datetime "updated_at",  :null => false
  end

  add_index "relationships", ["followed_id"], :name => "index_relationships_on_followed_id"
  add_index "relationships", ["follower_id", "followed_id"], :name => "index_relationships_on_follower_id_and_followed_id", :unique => true
  add_index "relationships", ["follower_id"], :name => "index_relationships_on_follower_id"

  create_table "test", :id => false, :force => true do |t|
    t.string  "vid",                :limit => nil
    t.string  "etag",               :limit => nil
    t.string  "publishedat",        :limit => nil
    t.string  "channelid",          :limit => nil
    t.string  "thumbnailsdefault",  :limit => nil
    t.string  "thumbnailsmedium",   :limit => nil
    t.string  "thumbnailshigh",     :limit => nil
    t.string  "thumbnailsstandard", :limit => nil
    t.string  "channeltitle",       :limit => nil
    t.integer "youtubecategoryid"
    t.integer "viewcount"
    t.integer "likecount"
    t.integer "dislikecount"
    t.integer "favoritecount"
    t.integer "commentcount"
    t.string  "embedhtml",          :limit => nil
    t.string  "title",              :limit => nil
    t.text    "description"
    t.string  "category",           :limit => nil
    t.string  "dancer",             :limit => nil
    t.float   "ratio"
  end

  create_table "top_cats", :force => true do |t|
    t.string   "name"
    t.datetime "created_at", :null => false
    t.datetime "updated_at", :null => false
  end

  create_table "user_cat_relationships", :force => true do |t|
    t.integer  "user_id"
    t.integer  "category_id"
    t.datetime "created_at",  :null => false
    t.datetime "updated_at",  :null => false
  end

  add_index "user_cat_relationships", ["category_id"], :name => "index_user_cat_relationships_on_category_id"
  add_index "user_cat_relationships", ["user_id", "category_id"], :name => "index_user_cat_relationships_on_user_id_and_category_id", :unique => true
  add_index "user_cat_relationships", ["user_id"], :name => "index_user_cat_relationships_on_user_id"

  create_table "user_dancer_relationships", :force => true do |t|
    t.integer  "user_id"
    t.integer  "dancer_id"
    t.datetime "created_at",  :null => false
    t.datetime "updated_at",  :null => false
    t.integer  "category_id"
  end

  add_index "user_dancer_relationships", ["category_id"], :name => "index_user_dancer_relationships_on_category_id"
  add_index "user_dancer_relationships", ["dancer_id", "category_id"], :name => "index_user_dancer_relationships_on_dancer_id_and_category_id", :unique => true
  add_index "user_dancer_relationships", ["user_id", "dancer_id"], :name => "index_user_dancer_relationships_on_user_id_and_dancer_id", :unique => true
  add_index "user_dancer_relationships", ["user_id"], :name => "index_user_dancer_relationships_on_user_id"

  create_table "users", :force => true do |t|
    t.string   "name"
    t.string   "email"
    t.datetime "created_at",                         :null => false
    t.datetime "updated_at",                         :null => false
    t.string   "password_digest"
    t.string   "remember_token"
    t.boolean  "admin",           :default => false
  end

  add_index "users", ["email"], :name => "index_users_on_email", :unique => true
  add_index "users", ["remember_token"], :name => "index_users_on_remember_token"

  create_table "videos", :id => false, :force => true do |t|
    t.string   "vid",                 :limit => 1000
    t.string   "etag",                :limit => 1000
    t.datetime "created_at",                          :null => false
    t.datetime "updated_at",                          :null => false
    t.string   "channel_id"
    t.text     "thumbnails_default"
    t.text     "thumbnails_medium"
    t.text     "thumbnails_high"
    t.text     "thumbnails_standard"
    t.string   "channel_title"
    t.integer  "youtube_category_id"
    t.integer  "view_count"
    t.integer  "like_count"
    t.integer  "dislike_count"
    t.integer  "favorite_count"
    t.integer  "comment_count"
    t.string   "embed_html",          :limit => 3000
    t.string   "title",               :limit => 1000
    t.text     "description"
    t.string   "category"
    t.string   "dancer"
    t.float    "heuristic"
    t.integer  "relevance"
    t.integer  "dancer_id"
    t.integer  "category_id"
  end

  add_index "videos", ["category_id"], :name => "index_videos_on_category_id"
  add_index "videos", ["dancer_id"], :name => "index_videos_on_dancer_id"
  add_index "videos", ["heuristic"], :name => "index_videos_on_heuristic"
  add_index "videos", ["relevance"], :name => "index_videos_on_relevance"

end
