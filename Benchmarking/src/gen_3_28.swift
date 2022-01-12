  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: [s0]
    var p1: s0
  }
  struct s6 {
    var p0: [s3]
    var p1: s0
  }
  struct s10 {
    var p0: s2
    var p1: s6
  }
  func f32(_ v0: Double, _ v1: s0) -> Double {
    let v8: [[Double]] = v1.p0
    var v4: [[Double]] = v8
    let v3: [Double] = v4[0]
    let v2: [[Double]] = v1.p1
    let v5: Double = v3[0]
    let v7: [Double] = v2[2]
    let v17: [[Double]] = v1.p0
    let v18: [[Double]] = v1.p1
    let v20: [Double] = v18[0]
    v4[0] = v7
    v4[0] = v20
    let v12: [Double] = v17[1]
    let v16: Double = v12[0]
    let v26: Double = v5 - v16
    v4[0] = v3
    return v26
  }
  @inline(never)
  func f0(_ v0: [[s10]], _ v1: s3, _ v2: Double) -> Double {
    var v7: s3 = v1
    let v5: [s0] = v7.p0
    let v10: [s0] = v7.p0
    let v22: s0 = v10[0]
    let v60: Double = f32(v2, v22)
    v7.p0 = v5
    let v62: Double = f32(v60, v22)
    return v62
  }
  func benchmark() {
    let v0: [[s10]] = [[s10(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]]), p1: s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: [[s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]])), p1: s6(p0: [s3(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))], p1: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])))], [s10(p0: s2(p0: s1(p0: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), p1: [[s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]]), p1: s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), p1: [[s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]])]])), p1: s6(p0: [s3(p0: [s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])], p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]]))], p1: s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]])))]]
    let v1: s3 = s3(p0: [s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]])], p1: s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]]))
    let v2: Double = 80.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 80.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
