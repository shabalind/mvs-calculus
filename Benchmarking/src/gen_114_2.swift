  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  func f93(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p2
    let v12: [[Double]] = v0.p3
    let v3: [Double] = v12[1]
    let v7: [Double] = v12[0]
    let v8: [[Double]] = v0.p3
    let v25: [[Double]] = v0.p0
    var v15: [[Double]] = v12
    let v17: s0 = s0(p0: v2, p1: v15, p2: v25, p3: v15)
    let v30: [[Double]] = v17.p1
    v15[0] = v3
    var v20: [[Double]] = v8
    let v28: [[Double]] = v0.p1
    v20[1] = v7
    let v27: [[Double]] = v0.p2
    let v35: s0 = s0(p0: v27, p1: v20, p2: v27, p3: v30)
    let v48: [Double] = v28[0]
    let v40: [[Double]] = v35.p0
    v15[1] = v48
    let v124: s0 = s0(p0: v25, p1: v30, p2: v40, p3: v12)
    return v124
  }
  func f89(_ v0: s0) -> s0 {
    let v1: s0 = f93(v0)
    let v2: s0 = f93(v0)
    let v10: [[Double]] = v2.p1
    let v24: [[Double]] = v1.p0
    let v12: [[Double]] = v2.p3
    let v15: s0 = s0(p0: v24, p1: v12, p2: v24, p3: v10)
    let v186: s0 = f93(v15)
    return v186
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: [[Double]] = v0.p2
    var v4: s0 = v0
    let v5: [[Double]] = v4.p1
    var v8: [[Double]] = v7
    var v10: s0 = v4
    let v3: [Double] = v7[0]
    v4 = v0
    v4 = v0
    let v18: s0 = f89(v10)
    let v16: [[Double]] = v18.p1
    let v11: [[Double]] = v10.p3
    let v14: [[Double]] = v10.p2
    let v43: [[Double]] = v18.p3
    let v15: [[[Double]]] = [v7, v8]
    v8[1] = v3
    let v22: s0 = f89(v10)
    let v24: s0 = f89(v4)
    var v34: s0 = v22
    v8[0] = v3
    let v25: [Double] = v5[1]
    v8[2] = v25
    let v36: [[Double]] = v34.p0
    let v66: s0 = f93(v4)
    v8[0] = v3
    v4.p2 = v7
    let v32: [[Double]] = v24.p1
    let v41: [[Double]] = v15[0]
    v8[0] = v3
    v8[2] = v3
    v8[2] = v3
    v8[2] = v25
    v10.p1 = v43
    let v27: [[Double]] = v34.p0
    let v30: [[Double]] = v66.p1
    v4.p2 = v8
    v4.p0 = v14
    var v31: [Double] = v25
    let v37: s0 = f89(v0)
    v34.p1 = v11
    v4.p0 = v27
    v31[0] = v1
    v34.p2 = v36
    let v53: [[Double]] = v15[0]
    v4.p0 = v41
    let v46: [[Double]] = v37.p3
    v34.p2 = v7
    v8[2] = v31
    v34.p1 = v32
    let v152: [[Double]] = v34.p1
    v34.p1 = v16
    v10.p0 = v53
    v4.p1 = v46
    v10.p3 = v152
    let v115: Double = v31[0]
    v10.p3 = v30
    let v172: [[Double]] = v15[0]
    v10.p2 = v172
    v10.p1 = v43
    return v115
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0], [7.0]], p3: [[8.0], [9.0]])
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
