  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [[s1]]
    var p1: s1
  }
  func f38(_ v0: s1, _ v1: Double) -> Double {
    let v7: s0 = v0.p1
    let v2: [s0] = [v7, v7, v7, v7, v7, v7, v7]
    let v9: s0 = v2[1]
    let v5: [Double] = [v1, v1, v1, v1, v1]
    let v4: [[Double]] = v9.p0
    let v24: Double = v5[3]
    let v22: [Double] = v4[1]
    let v72: Double = v22[0]
    var v82: Double = v72
    v82 = v24
    return v82
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s3, _ v2: Double) -> Double {
    let v3: s0 = v0.p1
    let v7: [s0] = [v3, v3, v3, v3, v3, v3, v3]
    let v11: s1 = s1(p0: v3, p1: v3)
    var v18: s0 = v3
    let v16: s0 = v7[2]
    let v19: [[Double]] = v18.p0
    v18 = v16
    let v17: [Double] = v19[1]
    let v23: Double = f38(v11, v2)
    let v84: Double = v17[0]
    let v40: Double = v84 - v23
    v18.p0 = v19
    return v40
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]))
    let v1: s3 = s3(p0: [[s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))], [s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))], [s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]))]], p1: s1(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])))
    let v2: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
