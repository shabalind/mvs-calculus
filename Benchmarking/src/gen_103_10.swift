  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s1], _ v2: [s0], _ v3: Double) -> Double {
    let v6: s1 = v1[0]
    let v7: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p0
    let v14: s0 = v6.p0
    let v15: s1 = v1[2]
    let v16: [Double] = v7[0]
    let v12: s0 = v15.p1
    let v4: [[Double]] = v12.p1
    let v10: s1 = v1[0]
    let v20: s0 = v10.p0
    var v13: s0 = v20
    var v23: [[Double]] = v5
    let v17: [Double] = v23[0]
    v23[0] = v16
    let v27: s0 = v6.p1
    var v33: s1 = v10
    v33.p1 = v14
    let v45: s0 = v33.p0
    v33.p1 = v27
    let v40: [Double] = v23[0]
    let v25: [[Double]] = v45.p1
    let v49: Double = v40[0]
    v23[0] = v40
    var v62: [Double] = v17
    v62 = v40
    v13.p1 = v4
    let v47: [Double] = v25[1]
    let v88: Double = v49 / v49
    let v66: Double = v47[0]
    v23[0] = v47
    v23[0] = v62
    var v134: Double = v88
    v33.p0 = v13
    v62[0] = v49
    v62[0] = v66
    v13.p0 = v23
    var v107: Double = v134
    return v107
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: [s1] = [s1(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]])), s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]])), s1(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0], [20.0]]))]
    let v2: [s0] = [s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])]
    let v3: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
