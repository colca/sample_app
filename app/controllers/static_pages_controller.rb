class StaticPagesController < ApplicationController
  def home
    if signed_in?
      @micropost = current_user.microposts.build
      #@feed_items = current_user.feed.paginate(page: params[:page])
      @dancer_video_feeds = current_user.dancerVideos.paginate(page: params[:page])
      @category1_feeds = current_user.categoryVideos(1).paginate(page: params[:page])
      @category2_feeds = current_user.categoryVideos(2).paginate(page: params[:page])
      @category3_feeds = current_user.categoryVideos(3).paginate(page: params[:page])
      @category4_feeds = current_user.categoryVideos(4).paginate(page: params[:page])
    end
  end

  def help
  end

  def about
  end
  
  def contact
  end
end
