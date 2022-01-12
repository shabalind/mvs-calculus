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
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [[s2]]
    var p1: s0
  }
  struct s8 {
    var p0: [[s0]]
    var p1: [[s3]]
  }
  func f45(_ v0: s2) -> s2 {
    let v7: s0 = v0.p1
    let v13: [[Double]] = v7.p1
    let v16: [[Double]] = v7.p0
    let v24: s0 = s0(p0: v16, p1: v13)
    let v27: [s0] = [v24, v24]
    var v80: [s0] = v27
    let v124: s0 = v80[1]
    var v180: s2 = v0
    v180.p1 = v124
    return v180
  }
  func f43(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v2: [s0] = [v0, v0, v0, v0]
    var v7: s0 = v0
    let v3: [[Double]] = v5.p1
    var v4: [s0] = v2
    v5.p1 = v3
    let v8: s0 = v4[3]
    var v10: [s0] = v4
    var v11: [s0] = v2
    var v6: [[Double]] = v3
    var v12: [[Double]] = v6
    let v18: s0 = v11[3]
    v11[2] = v8
    let v14: [[Double]] = v18.p0
    let v25: s0 = v10[0]
    v4[2] = v25
    v7.p0 = v14
    var v22: [[Double]] = v3
    var v23: [[Double]] = v14
    var v21: [[Double]] = v23
    let v36: s0 = v11[2]
    v7.p1 = v12
    let v20: [[Double]] = v36.p0
    let v40: [[Double]] = v25.p1
    let v51: [Double] = v21[0]
    v7.p0 = v20
    var v38: [[Double]] = v20
    v7.p1 = v12
    var v31: [[Double]] = v6
    let v39: s2 = s2(p0: v18, p1: v5)
    v4[3] = v5
    var v71: s2 = v39
    let v77: s2 = f45(v39)
    v5.p0 = v38
    v7.p1 = v31
    let v100: s0 = v10[2]
    let v29: s0 = v77.p1
    var v46: s2 = v71
    let v64: s2 = f45(v46)
    v71.p0 = v36
    let v70: s2 = f45(v64)
    v5.p1 = v40
    v71.p0 = v29
    v71.p1 = v100
    v12[0] = v51
    let v52: s0 = v39.p1
    v46.p0 = v100
    v71.p1 = v52
    let v126: [[Double]] = v7.p0
    v71.p1 = v5
    v4[0] = v18
    let v239: s0 = v70.p1
    let v170: [[Double]] = v239.p1
    v6 = v170
    v5.p1 = v22
    v5.p0 = v126
    return v239
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s8, _ v2: Double) -> Double {
    let v4: s1 = v0[0]
    let v7: s0 = v4.p0
    var v9: Double = v2
    let v18: Double = v9 * v9
    let v19: [[Double]] = v7.p0
    let v59: s0 = f43(v7)
    let v20: [[Double]] = v59.p0
    var v45: Double = v18
    let v28: [Double] = v19[0]
    let v42: [Double] = v20[0]
    let v26: Double = v28[0]
    var v48: [Double] = v28
    v48[0] = v45
    let v39: Double = v26 + v9
    let v84: Double = v42[0]
    var v94: [Double] = v48
    v48[0] = v84
    v48[0] = v26
    v48[0] = v84
    v48[0] = v18
    v94[0] = v39
    let v53: Double = v94[0]
    v48[0] = v2
    return v53
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))]
    let v1: s8 = s8(p0: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])]], p1: [[s3(p0: [[s2(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0], [20.0]]))]], p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]]))], [s3(p0: [[s2(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: s0(p0: [[27.0]], p1: [[28.0], [29.0]]))]], p1: s0(p0: [[30.0]], p1: [[31.0], [32.0]]))]])
    let v2: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
