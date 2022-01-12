  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: Double
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: [s2]
    var p2: [[s0]]
  }
  struct s10 {
    var p0: [s0]
    var p1: s3
  }
  func f50(_ v0: Double) -> Double {
    var v1: Double = v0
    let v7: Double = v1 - v0
    let v13: Double = v0 * v1
    var v4: Double = v13
    var v8: Double = v1
    var v6: Double = v1
    var v5: Double = v6
    var v10: Double = v8
    var v17: Double = v0
    var v3: Double = v7
    v8 = v1
    let v11: Double = v13 + v5
    var v16: Double = v17
    var v12: Double = v1
    var v15: Double = v1
    var v19: Double = v15
    var v14: Double = v12
    let v34: [Double] = [v12, v5, v12, v15, v15, v16]
    var v35: [Double] = v34
    let v24: Double = v15 * v1
    let v51: Double = v35[1]
    let v25: Double = v15 * v11
    let v32: Double = v14 - v10
    v35[0] = v25
    let v23: [Double] = [v51, v16, v24, v19, v17, v32, v24]
    var v53: [Double] = v23
    let v28: Double = v53[4]
    let v33: Double = v35[0]
    v35[5] = v33
    var v29: [Double] = v35
    v53[2] = v4
    let v46: Double = v34[1]
    let v60: Double = v34[1]
    v29[5] = v3
    v53[1] = v8
    v17 = v46
    var v58: [Double] = v29
    v29[3] = v28
    var v37: [Double] = v58
    v37[5] = v60
    let v49: Double = v37[5]
    v37[4] = v11
    return v49
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s10, _ v2: Double) -> Double {
    let v6: Double = f50(v2)
    let v11: Double = f50(v2)
    let v9: Double = v11 + v11
    let v78: Double = v9 + v6
    return v78
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: 4.0), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0]], p2: 9.0)), s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0]], p2: 14.0), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0]], p2: 19.0)), s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]], p2: 24.0), p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0]], p2: 29.0))]
    let v1: s10 = s10(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0]], p2: 34.0)], p1: s3(p0: [s1(p0: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0]], p2: 39.0), p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]], p2: 44.0))], p1: [s2(p0: [s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0]], p2: 49.0), p1: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0]], p2: 54.0)), s1(p0: s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0]], p2: 59.0), p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]], p2: 64.0))], p1: s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0]], p2: 69.0))], p2: [[s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0]], p2: 74.0)]]))
    let v2: Double = 75.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 75.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
