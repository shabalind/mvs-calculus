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
    var p0: [s1]
    var p1: [[s0]]
  }
  func f96(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    let v4: [Double] = v2[0]
    var v1: [[Double]] = v2
    let v7: [Double] = v2[0]
    v1[0] = v7
    var v5: s0 = v0
    let v8: [[Double]] = v0.p1
    let v6: [Double] = v1[0]
    var v13: s0 = v5
    var v9: s0 = v13
    var v10: s0 = v0
    v10 = v0
    let v14: Double = v4[0]
    var v11: s0 = v5
    var v18: [Double] = v7
    let v16: [[Double]] = v10.p1
    let v21: [Double] = v1[1]
    v11.p0 = v1
    let v15: Double = v21[0]
    var v25: [Double] = v21
    v5.p1 = v8
    let v40: Double = v18[0]
    v1[1] = v21
    let v36: Double = v40 + v15
    v18[0] = v40
    let v68: [[Double]] = v9.p0
    let v43: [[Double]] = v9.p0
    var v47: s0 = v11
    let v26: [Double] = v68[1]
    v25[0] = v14
    v1[0] = v6
    let v39: [[Double]] = v13.p0
    let v49: [s0] = [v47, v10, v47, v5]
    var v38: [s0] = v49
    var v56: [s0] = v49
    v1[1] = v26
    let v59: [[Double]] = v47.p1
    v25[0] = v36
    let v58: s0 = s0(p0: v68, p1: v59)
    let v77: [[Double]] = v11.p1
    v38[3] = v58
    let v89: s0 = s0(p0: v1, p1: v16)
    let v32: [[Double]] = v13.p0
    let v62: s0 = v56[3]
    var v28: [s0] = v38
    let v75: s0 = v28[3]
    let v57: s0 = s0(p0: v39, p1: v77)
    var v106: [[Double]] = v77
    var v92: s0 = v89
    v28[0] = v57
    v10.p0 = v32
    let v125: [[Double]] = v62.p1
    v10.p1 = v125
    let v84: [[Double]] = v92.p0
    let v86: s0 = s0(p0: v43, p1: v8)
    v106[0] = v25
    let v123: [[Double]] = v86.p1
    var v78: [[Double]] = v106
    v10.p0 = v43
    v92.p1 = v123
    v11.p0 = v84
    v56[3] = v89
    v5.p1 = v78
    return v75
  }
  func f50(_ v0: s1) -> s1 {
    var v5: s1 = v0
    let v7: s0 = v0.p0
    v5.p0 = v7
    let v1: [s0] = [v7, v7, v7, v7]
    var v4: s0 = v7
    var v3: s0 = v4
    let v6: s0 = f96(v3)
    let v11: s0 = f96(v6)
    let v17: s0 = f96(v4)
    let v15: s0 = f96(v4)
    let v10: s0 = f96(v4)
    var v20: s1 = v5
    v20.p0 = v11
    let v30: [s0] = v20.p1
    let v33: [[Double]] = v17.p0
    let v28: s0 = f96(v10)
    v4.p0 = v33
    let v14: s0 = f96(v3)
    v20.p0 = v28
    let v51: s0 = v1[2]
    var v43: s1 = v20
    let v42: s0 = f96(v15)
    let v186: s0 = f96(v42)
    let v78: [s0] = v43.p1
    v43.p1 = v78
    v43.p1 = v78
    v5.p0 = v17
    v43.p1 = v30
    v43.p1 = v30
    v5.p0 = v14
    v43.p0 = v15
    let v159: [[Double]] = v51.p1
    v43.p1 = v78
    v5.p1 = v78
    v3.p1 = v159
    let v224: [s0] = v43.p1
    let v258: s1 = s1(p0: v186, p1: v224)
    return v258
  }
  func f29(_ v0: s1) -> s1 {
    let v4: s0 = v0.p0
    let v7: s1 = f50(v0)
    let v2: s1 = f50(v7)
    let v5: s0 = v0.p0
    let v14: [s0] = v0.p1
    let v8: s0 = f96(v5)
    let v6: s1 = f50(v2)
    var v1: s0 = v8
    let v3: s1 = s1(p0: v1, p1: v14)
    let v9: s1 = f50(v2)
    var v10: s1 = v3
    var v29: s0 = v5
    var v15: s0 = v29
    var v11: [s0] = v14
    var v19: s1 = v9
    var v23: [s0] = v11
    let v12: s0 = v23[1]
    v11[0] = v12
    v19.p0 = v4
    let v18: s0 = f96(v29)
    v1 = v18
    var v33: s0 = v4
    let v36: s1 = s1(p0: v4, p1: v23)
    var v21: s0 = v8
    let v17: [[Double]] = v33.p0
    let v22: s0 = v36.p0
    let v25: s0 = f96(v18)
    var v28: [[Double]] = v17
    let v44: s0 = v11[0]
    let v37: [[Double]] = v21.p0
    v23[1] = v22
    let v57: [s0] = v36.p1
    let v62: s1 = f50(v6)
    v23[1] = v44
    v15.p0 = v37
    let v48: [s1] = [v9, v36, v0, v10, v19, v0, v10]
    v11[1] = v1
    let v60: s0 = f96(v8)
    v21.p0 = v28
    var v39: [s1] = v48
    v21 = v25
    let v104: [s0] = v62.p1
    v19.p1 = v104
    v19.p0 = v15
    let v94: s1 = v39[0]
    v19.p1 = v57
    let v121: [[Double]] = v60.p1
    v19.p0 = v60
    v21.p1 = v121
    return v94
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v8: [s1] = v0.p0
    let v9: s1 = v8[1]
    let v43: s1 = f29(v9)
    let v22: Double = v1 * v1
    let v44: s0 = v43.p0
    let v33: s0 = f96(v44)
    let v34: [[Double]] = v33.p0
    let v32: [Double] = v34[0]
    let v59: Double = v32[0]
    let v298: Double = v22 - v59
    return v298
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])]), s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])]), s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: [s0(p0: [[21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0]])])], p1: [[s0(p0: [[27.0], [28.0]], p1: [[29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0]])]])
    let v1: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
