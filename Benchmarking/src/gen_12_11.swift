  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s6 {
    var p0: [s0]
    var p1: s1
  }
  func f58(_ v0: Double) -> Double {
    var v7: Double = v0
    var v4: Double = v0
    var v1: Double = v7
    var v5: Double = v0
    var v2: Double = v5
    var v3: Double = v1
    v7 = v5
    var v11: Double = v3
    var v13: Double = v11
    var v8: Double = v11
    var v6: Double = v2
    v5 = v3
    v7 = v0
    var v17: Double = v8
    v5 = v7
    var v37: Double = v11
    let v16: [Double] = [v6, v2, v5, v17]
    let v27: Double = v16[0]
    let v48: Double = v16[0]
    let v36: [Double] = [v48, v4, v27, v17, v13, v37]
    let v43: Double = v36[4]
    return v43
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: Double) -> Double {
    let v2: Double = f58(v1)
    let v5: Double = v2 * v2
    let v13: Double = f58(v5)
    return v13
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], p1: s1(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p1: [[s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]]))], [s6(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: [[s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]]))], [s6(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])], p1: s1(p0: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), p1: [[s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]]))]]
    let v1: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
