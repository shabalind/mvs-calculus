  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [[Double]]
    var p2: [[s0]]
    var p3: s0
    var p4: [[s1]]
  }
  struct s4 {
    var p0: [[s1]]
    var p1: s0
  }
  struct s6 {
    var p0: s2
    var p1: s1
  }
  func f52(_ v0: Double) -> Double {
    var v7: Double = v0
    var v4: Double = v7
    let v6: [Double] = [v0, v7, v4, v0, v4]
    var v11: [Double] = v6
    let v2: Double = v11[2]
    v7 = v2
    v11 = v6
    v11[4] = v7
    v11[1] = v2
    let v17: Double = v11[4]
    v11[3] = v7
    return v17
  }
  func f48(_ v0: [s0]) -> [s0] {
    let v2: s0 = v0[0]
    var v5: [s0] = v0
    let v7: s0 = v0[0]
    v5[1] = v7
    var v14: [s0] = v0
    let v12: s0 = v14[1]
    v14 = v5
    v5[1] = v2
    let v61: s1 = s1(p0: v5, p1: v12)
    let v126: [s0] = v61.p0
    return v126
  }
  func f42(_ v0: s0, _ v1: s1) -> s1 {
    let v8: [s1] = [v1, v1, v1, v1]
    var v6: [s1] = v8
    v6[1] = v1
    let v9: s1 = v6[1]
    v6 = v8
    v6[3] = v1
    var v18: [s1] = v6
    v18[1] = v1
    v6 = v8
    v6 = v18
    v6[0] = v1
    v18[2] = v1
    return v9
  }
  func f40(_ v0: s1) -> s1 {
    var v7: s1 = v0
    var v8: s1 = v7
    let v1: [s0] = v7.p0
    let v2: [s0] = f48(v1)
    let v3: s0 = v1[0]
    let v4: s0 = v2[0]
    v8 = v7
    let v11: [s1] = [v0, v8, v7]
    let v5: s1 = f42(v3, v0)
    let v18: s0 = v0.p1
    var v14: [s1] = v11
    let v17: [s0] = [v4]
    v7.p1 = v18
    v8.p0 = v1
    let v24: s1 = v14[0]
    v14[2] = v5
    v8 = v7
    let v49: [s1] = [v24, v5, v5]
    let v27: s1 = v14[0]
    let v35: s0 = v17[0]
    var v43: [s1] = v49
    let v38: s1 = f42(v35, v27)
    v43[2] = v0
    v43[2] = v38
    let v90: s1 = v43[1]
    return v90
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: s1, _ v2: [s4], _ v3: Double) -> Double {
    let v4: s1 = f40(v1)
    let v17: [s0] = v4.p0
    let v23: [s0] = f48(v17)
    let v35: [s0] = f48(v23)
    let v26: s0 = v35[1]
    let v43: [[Double]] = v26.p1
    let v51: [Double] = v43[0]
    let v31: Double = v51[0]
    let v41: Double = f52(v31)
    return v41
  }
  func benchmark() {
    let v0: s6 = s6(p0: s2(p0: [s1(p0: [s0(p0: [0.0], p1: [[1.0]]), s0(p0: [2.0], p1: [[3.0]])], p1: s0(p0: [4.0], p1: [[5.0]])), s1(p0: [s0(p0: [6.0], p1: [[7.0]]), s0(p0: [8.0], p1: [[9.0]])], p1: s0(p0: [10.0], p1: [[11.0]]))], p1: [[12.0], [13.0], [14.0]], p2: [[s0(p0: [15.0], p1: [[16.0]])], [s0(p0: [17.0], p1: [[18.0]])], [s0(p0: [19.0], p1: [[20.0]])]], p3: s0(p0: [21.0], p1: [[22.0]]), p4: [[s1(p0: [s0(p0: [23.0], p1: [[24.0]]), s0(p0: [25.0], p1: [[26.0]])], p1: s0(p0: [27.0], p1: [[28.0]]))]]), p1: s1(p0: [s0(p0: [29.0], p1: [[30.0]]), s0(p0: [31.0], p1: [[32.0]])], p1: s0(p0: [33.0], p1: [[34.0]])))
    let v1: s1 = s1(p0: [s0(p0: [35.0], p1: [[36.0]]), s0(p0: [37.0], p1: [[38.0]])], p1: s0(p0: [39.0], p1: [[40.0]]))
    let v2: [s4] = [s4(p0: [[s1(p0: [s0(p0: [41.0], p1: [[42.0]]), s0(p0: [43.0], p1: [[44.0]])], p1: s0(p0: [45.0], p1: [[46.0]]))], [s1(p0: [s0(p0: [47.0], p1: [[48.0]]), s0(p0: [49.0], p1: [[50.0]])], p1: s0(p0: [51.0], p1: [[52.0]]))], [s1(p0: [s0(p0: [53.0], p1: [[54.0]]), s0(p0: [55.0], p1: [[56.0]])], p1: s0(p0: [57.0], p1: [[58.0]]))]], p1: s0(p0: [59.0], p1: [[60.0]]))]
    let v3: Double = 61.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 61.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
