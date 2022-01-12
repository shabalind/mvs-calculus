  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f4(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    let v7: [[Double]] = v0.p1
    let v3: [[Double]] = v0.p0
    var v4: s0 = v0
    v4 = v0
    var v12: s0 = v4
    let v1: [[Double]] = v4.p1
    v4.p0 = v3
    v12.p0 = v3
    let v10: s0 = s0(p0: v1, p1: v7)
    let v13: [[Double]] = v4.p1
    v12.p0 = v13
    let v8: [[Double]] = v4.p1
    v4.p1 = v3
    let v16: [[Double]] = v4.p1
    v12 = v10
    v12.p0 = v1
    let v45: [[Double]] = v10.p1
    let v49: [[Double]] = v4.p1
    var v59: [[Double]] = v45
    var v44: s0 = v0
    let v40: [[Double]] = v44.p1
    v12.p0 = v2
    v44.p1 = v45
    v4.p1 = v59
    v44.p0 = v16
    var v72: s0 = v12
    v44.p0 = v40
    let v79: [[Double]] = v72.p0
    let v127: s0 = s0(p0: v3, p1: v49)
    var v66: s0 = v12
    v72.p0 = v8
    v66.p1 = v40
    v12 = v127
    v12.p1 = v2
    v66.p0 = v79
    return v66
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: [s0], _ v3: s0, _ v4: Double) -> Double {
    let v6: s0 = v2[0]
    var v8: Double = v4
    let v15: s0 = f4(v3)
    var v12: Double = v8
    var v32: s0 = v15
    let v11: s0 = v1[0]
    let v21: [[Double]] = v6.p0
    let v16: s0 = v2[2]
    let v17: [[Double]] = v16.p1
    let v48: s0 = f4(v3)
    v32.p1 = v17
    v32.p0 = v21
    let v29: [[Double]] = v48.p1
    let v33: [[Double]] = v11.p0
    v32.p0 = v33
    let v44: [[Double]] = v32.p1
    let v27: [Double] = v44[2]
    v32.p1 = v21
    let v76: Double = v12 - v12
    v32.p1 = v29
    var v96: [Double] = v27
    let v114: Double = v96[0]
    let v108: [Double] = [v12, v76, v76, v114]
    v96[0] = v114
    let v85: Double = v108[3]
    return v85
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: [s0] = [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v2: [s0] = [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]
    let v3: s0 = s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])
    let v4: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
