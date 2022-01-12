  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  func f32(_ v0: s0) -> s0 {
    let v1: [s0] = [v0, v0, v0, v0, v0]
    var v7: s0 = v0
    var v5: s0 = v7
    var v6: s0 = v5
    let v2: [[Double]] = v0.p0
    let v4: s0 = v1[2]
    let v13: s0 = v1[3]
    var v19: [s0] = v1
    let v20: [[Double]] = v13.p0
    let v11: [[Double]] = v4.p0
    let v23: [[Double]] = v13.p1
    let v16: s0 = s0(p0: v2, p1: v23)
    let v28: [[Double]] = v5.p0
    let v24: [[[Double]]] = [v28, v11, v20, v2, v28, v28, v11]
    let v30: [[Double]] = v24[5]
    let v41: s0 = s0(p0: v20, p1: v23)
    v6.p0 = v20
    let v35: [[Double]] = v6.p1
    let v26: s0 = v19[2]
    let v14: s0 = v19[3]
    let v40: s0 = v19[1]
    v19[0] = v13
    v19[1] = v4
    let v73: [[Double]] = v40.p1
    let v47: s0 = v1[0]
    var v44: s0 = v14
    v5.p1 = v73
    let v39: [[Double]] = v47.p0
    v19[3] = v41
    let v54: [[Double]] = v44.p0
    let v64: [[Double]] = v16.p0
    v5.p0 = v54
    v44 = v7
    v44.p1 = v35
    v5.p1 = v73
    let v107: [[Double]] = v26.p1
    var v78: [[Double]] = v30
    v44.p0 = v39
    let v97: [[Double]] = v26.p1
    v7.p1 = v23
    let v244: s0 = s0(p0: v78, p1: v107)
    v44.p0 = v64
    v6.p1 = v97
    return v244
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v3: [s1] = v0[1]
    let v7: [s1] = v0[1]
    var v2: [s1] = v7
    let v4: s1 = v2[0]
    let v5: s1 = v3[0]
    var v8: Double = v1
    var v11: [s1] = v2
    let v9: s1 = v7[0]
    v11[0] = v9
    var v18: s1 = v5
    v11[0] = v4
    let v23: s1 = v11[0]
    v2[0] = v4
    let v20: s0 = v23.p1
    v2[0] = v18
    let v42: [[Double]] = v20.p0
    let v15: s0 = f32(v20)
    v11 = v7
    v18.p1 = v15
    var v63: s1 = v23
    let v19: [Double] = v42[2]
    v63.p1 = v20
    let v55: s0 = f32(v20)
    let v38: s0 = f32(v15)
    v2[0] = v63
    let v77: Double = v19[0]
    let v33: s0 = v9.p1
    var v49: Double = v8
    v63.p1 = v33
    let v32: [[Double]] = v55.p1
    let v36: s0 = f32(v38)
    v18.p1 = v36
    var v29: [[Double]] = v32
    var v52: [[Double]] = v32
    let v45: [[Double]] = v20.p0
    let v93: [[Double]] = v38.p1
    var v40: [[Double]] = v45
    let v65: s0 = s0(p0: v40, p1: v52)
    let v46: [Double] = v32[0]
    let v60: s0 = f32(v20)
    v63.p1 = v65
    let v37: [Double] = v93[0]
    v52[0] = v37
    let v112: s0 = f32(v60)
    let v98: [Double] = v29[0]
    let v194: Double = v49 + v77
    v63.p1 = v112
    v52[0] = v98
    v40[0] = v46
    return v194
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]], p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))], [s1(p0: [[s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))]]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
