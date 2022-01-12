  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v6: [s1] = v0[1]
    let v12: s1 = v6[0]
    let v9: s0 = v12.p0
    var v10: s0 = v9
    let v8: s1 = v6[0]
    let v32: [[Double]] = v10.p1
    var v18: s1 = v8
    var v17: s0 = v9
    var v11: [[Double]] = v32
    var v20: [[Double]] = v32
    var v22: s1 = v18
    let v43: s0 = v8.p0
    var v34: s0 = v17
    let v13: [Double] = v20[0]
    let v14: s0 = v22.p0
    v18.p0 = v17
    v20[0] = v13
    let v30: [[Double]] = v43.p0
    var v26: s0 = v43
    let v21: [Double] = v11[0]
    v17.p0 = v30
    v34.p0 = v30
    v34 = v17
    v18.p0 = v26
    v22.p0 = v26
    let v36: [Double] = v11[0]
    v26.p1 = v11
    let v41: s0 = v22.p0
    v20[0] = v36
    let v31: [[Double]] = v17.p1
    let v71: [[Double]] = [v13, v36, v13]
    let v68: [[Double]] = v34.p1
    v20[0] = v36
    v22.p0 = v9
    let v27: [Double] = v31[0]
    v26 = v14
    let v62: [Double] = v71[1]
    v11[0] = v62
    let v35: [[Double]] = v14.p0
    v20[0] = v21
    var v66: [[Double]] = v30
    let v37: [[Double]] = v41.p1
    v26.p0 = v66
    let v121: [Double] = v66[1]
    let v48: [[Double]] = v10.p0
    v66[2] = v62
    v66[2] = v27
    let v110: Double = v121[0]
    v34.p0 = v35
    v26.p0 = v48
    v17.p1 = v68
    v10.p1 = v37
    return v110
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]))], [s1(p0: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))]]
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
