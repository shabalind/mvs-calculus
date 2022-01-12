  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  func f65(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    let v8: [[Double]] = v0.p0
    let v4: [s0] = [v0, v0, v0, v0]
    let v13: s0 = v4[2]
    let v17: [[Double]] = v0.p0
    let v12: s0 = v4[3]
    let v24: [[Double]] = v13.p1
    var v19: s0 = v12
    let v50: [[Double]] = v19.p1
    v19.p1 = v50
    let v47: [[Double]] = v19.p0
    v19.p1 = v6
    v19.p1 = v24
    v19.p1 = v6
    v19.p0 = v47
    v19.p0 = v8
    let v67: s1 = s1(p0: v19, p1: v13)
    var v131: s1 = v67
    let v80: s0 = v4[1]
    var v87: s1 = v131
    v131.p1 = v80
    v19.p0 = v17
    let v180: s0 = v87.p0
    return v180
  }
  func f41(_ v0: s2) -> s2 {
    var v5: s2 = v0
    let v6: s1 = v5.p1
    let v3: s1 = v5.p1
    v5.p1 = v6
    v5 = v0
    let v4: s1 = v5.p1
    v5.p1 = v6
    v5.p1 = v4
    let v11: [s1] = v0.p0
    v5.p1 = v6
    var v40: s1 = v4
    v5 = v0
    let v62: s0 = v3.p0
    v40.p0 = v62
    let v83: s2 = s2(p0: v11, p1: v40)
    return v83
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v8: Double = v1
    var v2: s2 = v0
    var v5: Double = v8
    let v9: Double = v5 - v8
    let v6: [s1] = v2.p0
    let v10: s1 = v6[1]
    let v11: s0 = v10.p0
    let v19: s0 = f65(v11)
    let v25: [[Double]] = v19.p0
    let v18: s2 = f41(v0)
    let v23: s1 = v18.p1
    var v36: Double = v9
    let v39: [Double] = v25[0]
    var v16: [Double] = v39
    v2.p0 = v6
    let v24: Double = v16[0]
    v16[0] = v36
    v2.p1 = v23
    v2.p1 = v10
    return v24
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])), s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))], p1: s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])))
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
