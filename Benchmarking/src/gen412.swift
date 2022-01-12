  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  func f78(_ v0: s0) -> s0 {
    let v16: s1 = s1(p0: v0, p1: v0)
    let v59: [s1] = [v16, v16, v16, v16, v16, v16]
    let v19: s1 = v59[4]
    let v45: s0 = v16.p1
    let v30: s0 = v16.p1
    var v33: [s1] = v59
    v33[0] = v19
    let v73: s1 = v33[2]
    var v38: [s1] = v59
    let v70: s0 = v73.p1
    var v119: [s1] = v38
    let v86: s1 = v119[4]
    let v103: s1 = s1(p0: v30, p1: v45)
    v119[2] = v103
    v33[2] = v86
    return v70
  }
  func f66(_ v0: s1) -> s1 {
    var v5: s1 = v0
    let v2: s0 = v0.p1
    let v4: s0 = f78(v2)
    let v3: s0 = f78(v4)
    v5.p1 = v3
    v5.p1 = v2
    return v5
  }
  func f19(_ v0: s0) -> s0 {
    let v7: s0 = f78(v0)
    let v8: [Double] = v0.p1
    let v4: [[Double]] = v0.p0
    var v14: s0 = v7
    var v20: s0 = v14
    let v13: s0 = f78(v7)
    let v25: s0 = f78(v13)
    let v19: s1 = s1(p0: v13, p1: v25)
    v14.p0 = v4
    let v36: s1 = f66(v19)
    let v34: s0 = v36.p1
    v14.p1 = v8
    v14.p1 = v8
    let v55: [[Double]] = v34.p0
    v14.p0 = v55
    let v40: s0 = f78(v20)
    v20 = v40
    let v107: s0 = f78(v40)
    return v107
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    let v7: [s2] = v0[2]
    let v4: s2 = v7[0]
    let v5: s1 = v4.p0
    let v10: s1 = f66(v5)
    var v17: s1 = v10
    var v18: s1 = v10
    let v21: s0 = v17.p0
    v18.p1 = v21
    let v25: s0 = v4.p1
    let v12: s1 = f66(v18)
    v17.p0 = v25
    let v20: s0 = v18.p0
    v17.p1 = v20
    var v33: s1 = v12
    let v23: s0 = f19(v20)
    let v83: s0 = v12.p1
    let v41: s0 = v5.p0
    v18 = v33
    v33.p0 = v25
    let v31: s0 = f78(v41)
    v18.p1 = v31
    v18.p0 = v23
    let v82: [[Double]] = v83.p0
    var v69: s0 = v41
    v33.p1 = v23
    v18.p0 = v41
    var v51: s0 = v25
    v17.p0 = v51
    let v63: [Double] = v82[0]
    v18.p1 = v69
    let v132: Double = v63[0]
    v18.p0 = v25
    return v132
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: s1(p0: s0(p0: [[0.0]], p1: [1.0, 2.0]), p1: s0(p0: [[3.0]], p1: [4.0, 5.0])), p1: s0(p0: [[6.0]], p1: [7.0, 8.0]))], [s2(p0: s1(p0: s0(p0: [[9.0]], p1: [10.0, 11.0]), p1: s0(p0: [[12.0]], p1: [13.0, 14.0])), p1: s0(p0: [[15.0]], p1: [16.0, 17.0]))], [s2(p0: s1(p0: s0(p0: [[18.0]], p1: [19.0, 20.0]), p1: s0(p0: [[21.0]], p1: [22.0, 23.0])), p1: s0(p0: [[24.0]], p1: [25.0, 26.0]))]]
    let v1: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
