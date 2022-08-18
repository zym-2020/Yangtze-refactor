export interface DataListFuzzyQuery{
    page: number,
    size: number,
    keyword: string,
    tags: string[],
    property: string
    flag: boolean
}