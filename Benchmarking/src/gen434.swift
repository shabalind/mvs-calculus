  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
    var p6: [[Double]]
  }
  struct s1 {
    var p0: [Double]
    var p1: Double
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  func f89(_ v0: s1) -> s1 {
    var v4: s1 = v0
    let v1: Double = v4.p1
    let v6: Double = v4.p1
    let v3: [Double] = v4.p0
    var v2: Double = v1
    let v11: Double = v3[1]
    v4.p1 = v2
    var v10: Double = v1
    var v8: [Double] = v3
    v8[1] = v11
    v8[1] = v10
    var v24: s1 = v4
    v24.p0 = v3
    v8[1] = v11
    v4.p0 = v8
    v4.p1 = v6
    v24.p0 = v8
    return v24
  }
  func f17(_ v0: s1) -> s1 {
    let v3: s1 = f89(v0)
    let v6: s1 = f89(v0)
    let v9: [s1] = [v0, v3, v0, v6, v6, v3]
    let v13: s1 = v9[5]
    return v13
  }
  func f9(_ v0: s1) -> s1 {
    var v1: s1 = v0
    let v2: s1 = f17(v1)
    let v3: [s1] = [v0, v0, v0, v2, v1]
    let v7: [Double] = v0.p0
    var v4: [Double] = v7
    let v8: Double = v7[1]
    let v11: s1 = f17(v0)
    var v9: [s1] = v3
    v1.p1 = v8
    v1.p0 = v7
    let v6: s1 = f17(v1)
    let v14: s1 = f17(v1)
    let v5: s1 = f89(v2)
    v4[0] = v8
    let v13: s1 = v3[3]
    let v16: Double = v6.p1
    let v10: s1 = f89(v13)
    let v32: s1 = f89(v14)
    let v21: s1 = f89(v10)
    let v26: Double = v10.p1
    let v17: s1 = v9[1]
    let v33: [Double] = v5.p0
    let v19: s1 = f17(v1)
    let v23: Double = v21.p1
    let v36: Double = v33[0]
    v9[1] = v21
    var v28: s1 = v21
    let v62: [Double] = v13.p0
    let v42: Double = v26 / v26
    v9[3] = v17
    let v37: s1 = f17(v21)
    let v25: s1 = f89(v11)
    let v24: Double = v14.p1
    let v43: Double = v1.p1
    var v45: [s1] = v3
    v1.p0 = v33
    let v51: s1 = f17(v11)
    v45[3] = v51
    let v38: [[s1]] = [v3, v45, v9]
    let v27: s1 = f17(v11)
    v1.p0 = v62
    v45[1] = v19
    v4[0] = v16
    v9[2] = v27
    v9[0] = v25
    let v59: Double = v4[0]
    v1.p1 = v36
    v28.p0 = v7
    let v49: s1 = f17(v51)
    let v39: s1 = f89(v14)
    let v40: Double = v62[0]
    v9[2] = v27
    v4[1] = v43
    var v99: s1 = v1
    let v53: [Double] = v17.p0
    v4[0] = v24
    v45[4] = v17
    let v71: [s1] = v38[2]
    v99.p1 = v16
    let v56: [Double] = v28.p0
    let v65: Double = v53[1]
    var v73: [[s1]] = v38
    v4[0] = v23
    v99.p1 = v59
    v1.p1 = v40
    let v69: [s1] = [v39, v11, v0, v32]
    var v190: [s1] = v69
    var v57: [s1] = v190
    v4[0] = v65
    v99.p0 = v56
    v190[2] = v99
    v73[2] = v71
    let v167: s1 = v57[3]
    let v87: s1 = f17(v167)
    let v116: [s1] = v73[2]
    v9[1] = v5
    v9 = v116
    v9[0] = v49
    v28.p1 = v42
    v45[1] = v19
    v190[2] = v37
    return v87
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double, _ v2: s1, _ v3: s0, _ v4: s2) -> Double {
    let v9: s1 = f9(v2)
    let v13: s1 = f17(v9)
    let v45: [s1] = [v13, v2, v2, v13]
    var v35: [s1] = v45
    v35 = v45
    var v85: [s1] = v35
    let v73: s1 = v85[3]
    var v54: s1 = v73
    v35[1] = v73
    v35[3] = v9
    v85[3] = v54
    let v70: Double = v54.p1
    return v70
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0], [6.0]], p3: [[7.0]], p4: [[8.0], [9.0], [10.0]], p5: [[11.0], [12.0], [13.0]], p6: [[14.0], [15.0], [16.0]])
    let v1: Double = 17.0
    let v2: s1 = s1(p0: [18.0, 19.0], p1: 20.0)
    let v3: s0 = s0(p0: [[21.0]], p1: [[22.0], [23.0], [24.0]], p2: [[25.0], [26.0], [27.0]], p3: [[28.0]], p4: [[29.0], [30.0], [31.0]], p5: [[32.0], [33.0], [34.0]], p6: [[35.0], [36.0], [37.0]])
    let v4: s2 = s2(p0: [[s0(p0: [[38.0]], p1: [[39.0], [40.0], [41.0]], p2: [[42.0], [43.0], [44.0]], p3: [[45.0]], p4: [[46.0], [47.0], [48.0]], p5: [[49.0], [50.0], [51.0]], p6: [[52.0], [53.0], [54.0]])]], p1: s1(p0: [55.0, 56.0], p1: 57.0))
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[38.0]], [[39.0], [40.0], [41.0]], [[42.0], [43.0], [44.0]], [[45.0]], [[46.0], [47.0], [48.0]], [[49.0], [50.0], [51.0]], [[52.0], [53.0], [54.0]]])]], StructValue(Name(str='s1', ty=None), [[55.0, 56.0], 57.0])])
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
