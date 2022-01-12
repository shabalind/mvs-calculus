  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s0
  }
  func f115(_ v0: s3) -> s3 {
    let v6: s0 = v0.p1
    var v5: s3 = v0
    let v3: [s0] = v5.p0
    v5.p1 = v6
    let v2: s0 = v3[2]
    var v7: s0 = v2
    let v4: [[Double]] = v7.p1
    let v14: s0 = v3[0]
    let v18: [s0] = v0.p0
    var v13: s0 = v7
    v7.p1 = v4
    var v10: s3 = v5
    var v12: s3 = v10
    v7.p1 = v4
    let v27: [[Double]] = v7.p1
    v7.p1 = v27
    var v21: s3 = v12
    let v24: [s0] = v21.p0
    v5.p0 = v18
    var v38: s0 = v13
    v12.p1 = v38
    v12.p0 = v24
    let v51: [[Double]] = v14.p0
    v12.p1 = v38
    var v54: s3 = v12
    v21.p0 = v24
    var v48: s3 = v54
    v38 = v13
    v38.p0 = v51
    return v48
  }
  func f113(_ v0: s0) -> s0 {
    var v3: s0 = v0
    v3 = v0
    let v12: [[Double]] = v3.p1
    var v9: s0 = v0
    v9.p1 = v12
    return v9
  }
  func f100(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    var v5: [[Double]] = v3
    let v9: [[Double]] = v0.p0
    let v4: s0 = f113(v0)
    let v15: [Double] = v9[2]
    v5[0] = v15
    let v20: s0 = f113(v0)
    let v22: s0 = f113(v4)
    let v11: s1 = s1(p0: v0, p1: v22)
    let v24: s0 = f113(v4)
    var v28: s1 = v11
    v28.p1 = v22
    let v17: s0 = f113(v4)
    v28.p1 = v20
    v28.p1 = v24
    let v27: [[Double]] = v20.p1
    let v92: [Double] = v27[0]
    v5[0] = v92
    v28.p0 = v24
    let v86: s0 = f113(v0)
    let v38: s0 = f113(v17)
    v28.p1 = v38
    v28.p0 = v22
    let v74: [[Double]] = v20.p0
    let v77: s0 = v28.p0
    let v121: s0 = f113(v77)
    let v104: [[[Double]]] = [v5, v74]
    v28.p0 = v86
    let v185: [[Double]] = v104[1]
    var v106: s0 = v121
    v106.p0 = v185
    return v106
  }
  func f96(_ v0: s3) -> s3 {
    let v7: s3 = f115(v0)
    let v29: s3 = f115(v7)
    var v18: s3 = v29
    return v18
  }
  func f61(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v6: [[Double]] = v0.p0
    v3.p0 = v6
    let v4: [[Double]] = v0.p1
    let v1: [Double] = v4[0]
    let v12: s0 = f113(v3)
    var v7: [Double] = v1
    var v23: [[Double]] = v6
    v23[1] = v7
    v23[1] = v1
    v23[1] = v1
    var v35: s0 = v12
    v23[0] = v1
    v35.p0 = v23
    let v19: [[Double]] = v0.p1
    let v49: [Double] = v19[0]
    v23[2] = v49
    return v35
  }
  func f42(_ v0: s3) -> s3 {
    let v2: s3 = f115(v0)
    let v4: s3 = f115(v2)
    let v8: s3 = f96(v0)
    let v5: s0 = v8.p1
    let v6: s1 = s1(p0: v5, p1: v5)
    let v1: [s0] = v8.p0
    let v11: s3 = f115(v2)
    let v25: s0 = v1[2]
    let v10: s0 = f113(v5)
    let v3: s0 = f61(v25)
    let v18: s0 = f100(v25)
    let v19: s0 = v6.p1
    var v12: s3 = v4
    v12.p1 = v18
    let v13: [s0] = v2.p0
    let v21: [s0] = [v19, v10, v19]
    let v59: s3 = f115(v0)
    var v48: s3 = v11
    v12.p0 = v21
    let v32: s3 = s3(p0: v13, p1: v18)
    let v57: [s3] = [v32, v2, v48, v32, v0, v59, v12]
    v48.p0 = v1
    var v61: s3 = v0
    let v40: s3 = v57[3]
    let v70: s3 = v57[4]
    let v62: [s3] = [v40, v70, v32, v11, v61, v61]
    v48.p0 = v13
    let v215: s3 = v62[0]
    var v124: s3 = v215
    v48.p1 = v3
    v48.p0 = v13
    return v124
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s3, _ v2: Double) -> Double {
    let v5: s0 = f100(v0)
    var v7: s3 = v1
    let v4: s3 = f96(v7)
    let v8: s0 = v4.p1
    v7.p1 = v8
    let v11: s3 = f42(v4)
    let v12: [s0] = [v0, v5, v5]
    var v14: s3 = v1
    v7.p1 = v8
    let v49: s0 = v14.p1
    let v21: [[Double]] = v0.p0
    let v22: s0 = v11.p1
    let v23: s0 = f113(v22)
    var v53: s0 = v22
    let v41: [[Double]] = v23.p1
    v7.p1 = v49
    let v33: [Double] = v41[0]
    v14.p0 = v12
    let v34: Double = v33[0]
    v53.p0 = v21
    v7.p1 = v53
    let v64: s0 = v4.p1
    v7.p1 = v64
    return v34
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: s3 = s3(p0: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])], p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]))
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
