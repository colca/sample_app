class CategoriesController < ApplicationController

  def index
    @categories = Category.all
    @user = current_user
    @category
    @dancers   
    @dancer
    @dancer_index
  end

  def show
    @category = Category.find(params[:id])
    @category_feeds = current_user.categoryVideos(params[:id]).paginate(page: params[:page])
    @feed
    @dancers = @category.dancers.paginate(page: params[:page])
    @user = current_user
  end

end
