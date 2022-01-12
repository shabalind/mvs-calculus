  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s3 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  func f3(_ v0: [[s0]]) -> [[s0]] {
    var v2: [[s0]] = v0
    let v6: [s0] = v0[0]
    let v7: s0 = v6[0]
    v2[0] = v6
    var v4: [[s0]] = v2
    v2[0] = v6
    var v1: s0 = v7
    var v9: [[s0]] = v4
    var v15: [s0] = v6
    let v25: [[Double]] = v1.p0
    let v30: [[Double]] = v1.p1
    v15[0] = v1
    var v13: [[Double]] = v25
    v1.p3 = v13
    v2[0] = v15
    v1.p1 = v30
    v2 = v4
    return v9
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v11: s3 = v0
    var v2: s3 = v11
    let v4: [[s0]] = v0.p1
    let v7: [[s0]] = v11.p0
    let v8: [s0] = v7[2]
    let v9: [[s0]] = f3(v4)
    v11.p1 = v4
    let v17: [[s0]] = f3(v4)
    var v23: [[s0]] = v17
    let v18: [s0] = v7[0]
    v23 = v4
    var v14: [[s0]] = v7
    let v29: s0 = v8[0]
    var v35: [[s0]] = v9
    let v43: [[Double]] = v29.p3
    v35[0] = v18
    let v24: [Double] = v43[1]
    let v21: [[s0]] = f3(v35)
    let v31: [s0] = v14[1]
    let v36: [[s0]] = f3(v23)
    let v49: [s0] = v7[2]
    v35[0] = v31
    let v39: [[s0]] = f3(v36)
    let v73: [s0] = v23[0]
    var v48: [Double] = v24
    v35[0] = v49
    let v41: [[s0]] = f3(v39)
    v35[0] = v31
    v2.p1 = v21
    v2.p1 = v9
    let v87: [[s0]] = f3(v41)
    let v99: Double = v48[0]
    var v129: s3 = v2
    let v57: [s0] = v87[0]
    let v100: Double = v99 * v99
    v48[0] = v1
    var v92: [[s0]] = v14
    v92[2] = v57
    v11 = v129
    v23[0] = v73
    v2.p0 = v92
    return v100
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0]], p3: [[7.0], [8.0]])], [s0(p0: [[9.0], [10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0], [15.0]], p3: [[16.0], [17.0]])], [s0(p0: [[18.0], [19.0]], p1: [[20.0], [21.0], [22.0]], p2: [[23.0], [24.0]], p3: [[25.0], [26.0]])]], p1: [[s0(p0: [[27.0], [28.0]], p1: [[29.0], [30.0], [31.0]], p2: [[32.0], [33.0]], p3: [[34.0], [35.0]])]])
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
