  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f18(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    let v8: [[Double]] = v0.p0
    let v6: [[Double]] = v0.p0
    let v2: s0 = s0(p0: v8, p1: v6, p2: v7)
    let v17: [[Double]] = v0.p2
    let v11: [[Double]] = v0.p0
    let v40: [[Double]] = v0.p1
    let v26: s0 = s0(p0: v17, p1: v11, p2: v6)
    var v56: s0 = v26
    let v51: s1 = s1(p0: v2, p1: v56)
    var v52: s1 = v51
    v56.p0 = v40
    let v62: s0 = v52.p1
    v56.p0 = v7
    let v100: s0 = v52.p0
    v52.p0 = v62
    return v100
  }
  func f15(_ v0: s1, _ v1: [s0]) -> [s0] {
    let v3: s0 = v0.p1
    var v44: [s0] = v1
    v44[0] = v3
    v44 = v1
    return v44
  }
  func f12(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v6: s0 = f18(v0)
    let v7: s0 = f18(v6)
    var v1: s0 = v6
    let v4: [[Double]] = v6.p0
    let v8: s1 = s1(p0: v0, p1: v0)
    let v9: [[Double]] = v6.p1
    let v5: [[Double]] = v1.p1
    var v13: s0 = v7
    let v11: s0 = f18(v7)
    let v14: s0 = f18(v7)
    let v18: s1 = s1(p0: v1, p1: v6)
    let v16: s0 = v8.p0
    let v20: s0 = f18(v14)
    var v21: s1 = v18
    let v23: [[Double]] = v1.p0
    v1.p1 = v23
    var v35: s1 = v18
    let v36: [[Double]] = v20.p0
    let v44: [[Double]] = v14.p0
    v1.p2 = v5
    var v42: s1 = v21
    v1.p1 = v44
    v3.p2 = v9
    v3.p2 = v5
    v42.p1 = v16
    let v58: [s0] = [v3]
    v35.p1 = v11
    let v37: s0 = v18.p1
    v1.p2 = v4
    v35.p1 = v7
    var v68: s1 = v42
    let v96: [s0] = f15(v68, v58)
    let v27: [s0] = f15(v21, v96)
    let v29: s0 = v27[0]
    var v52: s1 = v18
    let v65: s0 = v52.p1
    v1.p1 = v36
    var v66: s1 = v35
    let v118: [s0] = f15(v8, v96)
    let v64: s0 = v68.p0
    let v98: s0 = v66.p0
    v1 = v65
    let v82: s0 = v118[0]
    v66.p0 = v6
    let v117: s1 = s1(p0: v65, p1: v13)
    v66.p0 = v29
    v52.p0 = v20
    v52 = v117
    v42.p0 = v37
    let v95: s0 = f18(v82)
    v68.p1 = v95
    v35.p0 = v64
    v35.p1 = v3
    return v98
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v6: s0 = v0.p0
    let v3: s0 = f12(v6)
    var v2: s1 = v0
    var v10: s1 = v2
    v2.p0 = v3
    let v15: s0 = v10.p1
    let v20: s0 = v0.p0
    v10.p1 = v20
    let v39: [[Double]] = v15.p2
    let v16: s0 = f12(v3)
    v10.p0 = v16
    let v14: [Double] = v39[0]
    let v50: Double = v14[0]
    return v50
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0]], p2: [[2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0]], p2: [[5.0]]))
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
