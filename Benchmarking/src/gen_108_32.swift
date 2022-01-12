  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s2
  }
  struct s4 {
    var p0: [[Double]]
    var p1: s1
  }
  struct s9 {
    var p0: s4
    var p1: [[Double]]
  }
  func f82(_ v0: Double) -> Double {
    var v5: Double = v0
    v5 = v0
    var v2: Double = v0
    var v7: Double = v5
    var v3: Double = v0
    var v10: Double = v2
    var v4: Double = v7
    v4 = v3
    var v14: Double = v2
    let v1: Double = v14 + v10
    var v12: Double = v3
    let v8: [Double] = [v10, v12]
    let v11: Double = v14 - v4
    var v9: [Double] = v8
    var v21: [Double] = v8
    var v20: Double = v0
    v21[1] = v5
    v21[0] = v2
    let v35: Double = v9[0]
    v21[1] = v4
    v21[0] = v20
    let v18: Double = v9[0]
    v9[1] = v1
    v9[1] = v1
    v9[0] = v14
    v9[0] = v11
    v2 = v18
    v21[0] = v35
    var v40: [Double] = v21
    v21[1] = v7
    var v24: [Double] = v8
    let v48: Double = v8[1]
    let v19: Double = v9[0]
    var v25: [Double] = v8
    v24[1] = v19
    var v56: [Double] = v25
    var v34: Double = v0
    var v36: [Double] = v40
    v21[1] = v48
    var v39: [Double] = v25
    var v64: Double = v34
    let v45: [[Double]] = [v39, v56, v36, v21, v24, v21, v24]
    var v70: [[Double]] = v45
    v36[0] = v64
    var v71: [[Double]] = v70
    let v132: Double = v5 - v19
    let v124: Double = v56[0]
    v12 = v14
    v39[0] = v124
    v71[3] = v56
    var v163: [[Double]] = v71
    let v75: [Double] = v163[6]
    let v102: Double = v75[1]
    v3 = v132
    return v102
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s9, _ v2: [[s3]], _ v3: Double) -> Double {
    let v5: Double = f82(v3)
    let v6: Double = f82(v3)
    let v48: Double = f82(v5)
    let v30: Double = v6 + v6
    let v22: Double = v48 * v30
    return v22
  }
  func benchmark() {
    let v0: s4 = s4(p0: [[0.0]], p1: s1(p0: s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0]]), p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0]]), s0(p0: [[13.0], [14.0], [15.0]], p1: [[16.0]])]))
    let v1: s9 = s9(p0: s4(p0: [[17.0]], p1: s1(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0]]), p1: [s0(p0: [[22.0], [23.0], [24.0]], p1: [[25.0]]), s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]])])), p1: [[34.0], [35.0]])
    let v2: [[s3]] = [[s3(p0: s2(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])))], [s3(p0: s2(p0: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])))]]
    let v3: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
