  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s0]
    var p1: [[s1]]
  }
  func f16(_ v0: s3) -> s3 {
    var v3: s3 = v0
    var v1: s3 = v0
    var v8: s3 = v0
    var v6: s3 = v1
    var v7: s3 = v3
    let v5: [s0] = v0.p0
    v1.p0 = v5
    v7.p0 = v5
    var v2: s3 = v1
    v1.p0 = v5
    v1 = v2
    v7.p0 = v5
    v1.p0 = v5
    let v20: [s3] = [v7, v1, v2, v2, v2, v8, v6]
    var v17: [s0] = v5
    v17 = v5
    v8.p0 = v17
    let v33: [[s1]] = v3.p1
    let v67: s3 = v20[3]
    v7.p1 = v33
    return v67
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v5: s3 = v0[1]
    var v4: Double = v1
    let v8: s3 = f16(v5)
    let v20: [s0] = v8.p0
    let v11: s0 = v20[2]
    let v41: [[Double]] = v11.p1
    let v14: [Double] = v41[2]
    let v51: Double = v14[0]
    let v195: Double = v51 / v4
    return v195
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: [[s1(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])], p1: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]])]]), s3(p0: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])], p1: [[s1(p0: [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])], p1: [[s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])]])]])]
    let v1: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
