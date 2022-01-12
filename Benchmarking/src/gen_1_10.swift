  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f80(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p0
    var v2: [[Double]] = v5
    let v4: s0 = s0(p0: v2, p1: v1)
    let v9: [[Double]] = v4.p0
    v2 = v5
    let v11: [Double] = v9[0]
    v2[0] = v11
    v2 = v9
    let v22: [[Double]] = v4.p1
    let v41: s0 = s0(p0: v9, p1: v22)
    return v41
  }
  func f73(_ v0: s0) -> s0 {
    let v5: s0 = f80(v0)
    let v3: [[Double]] = v5.p0
    let v4: [[Double]] = v0.p0
    let v1: s0 = f80(v0)
    let v8: [[Double]] = v5.p1
    let v7: s0 = f80(v0)
    var v10: s0 = v1
    let v12: [[Double]] = v10.p1
    v10.p0 = v4
    let v27: [[Double]] = v0.p1
    let v16: [[Double]] = v0.p1
    v10.p1 = v8
    let v26: s0 = f80(v7)
    v10.p1 = v16
    let v44: s0 = f80(v10)
    let v59: [[Double]] = v44.p0
    let v43: s0 = f80(v26)
    v10.p0 = v59
    let v36: [[Double]] = v43.p0
    let v39: s0 = f80(v43)
    let v45: s0 = s0(p0: v36, p1: v16)
    v10.p1 = v12
    v10.p0 = v36
    v10.p0 = v3
    let v53: [[Double]] = v39.p0
    v10.p1 = v16
    let v126: s0 = f80(v44)
    v10.p0 = v53
    v10.p1 = v27
    v10.p0 = v53
    v10.p0 = v53
    let v98: s0 = f80(v126)
    let v65: [[Double]] = v45.p1
    v10.p1 = v65
    v10.p0 = v59
    let v105: s0 = f80(v98)
    return v105
  }
  func f65(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v3: s0 = v1
    let v2: [[Double]] = v1.p1
    v3.p1 = v2
    return v3
  }
  func f35(_ v0: s0) -> s0 {
    let v3: s0 = f65(v0)
    var v5: s0 = v0
    var v6: s0 = v5
    let v1: s0 = f73(v5)
    let v2: [[Double]] = v1.p1
    let v25: s0 = f80(v3)
    var v11: s0 = v25
    var v22: s0 = v6
    var v36: [[Double]] = v2
    v5.p1 = v2
    v5 = v1
    let v17: s0 = f80(v11)
    v11.p1 = v2
    v5.p1 = v36
    let v34: [[Double]] = v22.p1
    v11.p1 = v34
    let v33: [[Double]] = v17.p0
    let v37: [[Double]] = v0.p0
    var v20: [[Double]] = v33
    let v69: s0 = f65(v1)
    v5.p0 = v33
    v6.p0 = v20
    v36 = v34
    var v48: [[Double]] = v37
    v22.p0 = v48
    return v69
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v8: s0 = v0
    var v2: s0 = v0
    let v4: [[Double]] = v0.p0
    let v6: [[Double]] = v8.p1
    let v14: s0 = f35(v2)
    v2.p1 = v6
    v8.p0 = v4
    let v42: s0 = f73(v14)
    let v52: [[Double]] = v42.p1
    let v44: [Double] = v52[0]
    let v69: Double = v44[0]
    var v71: Double = v69
    return v71
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
