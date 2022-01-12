  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v7: s0 = v0[0]
    var v5: [s0] = v0
    let v4: [[Double]] = v7.p1
    let v3: s0 = v0[0]
    let v9: [[Double]] = v7.p1
    let v2: [[Double]] = v7.p0
    var v6: [s0] = v0
    let v17: s0 = s0(p0: v2, p1: v4)
    var v10: [[Double]] = v2
    var v13: s0 = v3
    let v8: [Double] = v2[1]
    let v11: [[Double]] = v13.p1
    let v12: [[Double]] = v3.p1
    v13.p1 = v11
    let v22: [Double] = v2[0]
    v6[0] = v17
    let v15: [[Double]] = v17.p0
    v13.p1 = v9
    let v31: [Double] = v4[2]
    var v46: [[Double]] = v15
    let v29: s0 = v6[0]
    v10[1] = v22
    let v16: [[Double]] = v13.p0
    v13.p1 = v11
    var v23: [s0] = v0
    let v24: [[Double]] = v3.p1
    let v19: s0 = v5[0]
    let v43: [[Double]] = v17.p1
    let v45: [[Double]] = v29.p1
    v13.p1 = v24
    v10[1] = v31
    v23[0] = v3
    v46[0] = v8
    v13.p1 = v43
    v6[0] = v29
    let v39: [[Double]] = v19.p1
    let v28: [[Double]] = v7.p1
    v13.p1 = v28
    v23[0] = v29
    let v55: s0 = s0(p0: v46, p1: v39)
    let v51: [[Double]] = v55.p1
    v13.p0 = v15
    v46[1] = v31
    v13.p0 = v10
    let v34: [[Double]] = v17.p1
    v13.p1 = v39
    v13.p1 = v51
    v13.p0 = v46
    v13.p1 = v28
    v13.p1 = v51
    v6[0] = v7
    let v53: [Double] = v34[0]
    var v42: [s0] = v23
    v13.p1 = v39
    v46[1] = v22
    let v40: s0 = v42[0]
    v13.p1 = v45
    v13.p0 = v16
    v10[1] = v53
    let v65: [[Double]] = v29.p1
    v23 = v0
    v13.p1 = v12
    let v87: [Double] = v51[2]
    v5[0] = v40
    let v156: Double = v87[0]
    v46 = v16
    v13.p1 = v65
    return v156
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])]
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
