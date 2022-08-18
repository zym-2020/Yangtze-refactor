import { get, post, del, patch } from './axios'
import { DataListFuzzyQuery } from './paramType'

//data_list相关接口
export async function dataListFuzzyQuery(jsondata: DataListFuzzyQuery) {
    return await post(`/dataList/fuzzyQuery`, jsondata)
}

//browse_history相关接口
export async function getDataGroup(dataId: string, number: number) {
    return await get(`/browseHistory/getDataGroup/${dataId}/${number}`)
}


//download_history相关接口
export async function pageQueryDownloadHistory(dataListId: string, page: number, size: number) {
    return await get(`/downloadHistory/pageQuery/${dataListId}/${page}/${size}`)
}