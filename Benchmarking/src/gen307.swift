  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  func f67(_ v0: Double) -> Double {
    var v5: Double = v0
    let v3: [Double] = [v5, v0]
    let v10: Double = v3[0]
    return v10
  }
  func f12(_ v0: Double) -> Double {
    var v7: Double = v0
    let v1: Double = f67(v7)
    let v5: Double = f67(v7)
    let v3: Double = f67(v7)
    let v6: Double = f67(v3)
    let v2: Double = f67(v3)
    let v10: Double = f67(v1)
    let v8: [Double] = [v5, v6, v2, v10, v10, v6]
    var v14: [Double] = v8
    let v12: Double = f67(v7)
    let v22: Double = v14[4]
    let v24: Double = f67(v6)
    v14[4] = v2
    let v41: Double = f67(v22)
    v14[4] = v7
    var v28: Double = v24
    v14[3] = v22
    let v79: Double = f67(v22)
    v14[0] = v12
    let v71: [Double] = [v5, v79]
    var v42: [Double] = v71
    var v119: [Double] = v42
    let v88: [[Double]] = [v71, v71, v119]
    v14[5] = v28
    v7 = v41
    let v130: [Double] = v88[1]
    let v149: Double = v130[1]
    return v149
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v13: Double = f12(v1)
    let v8: Double = f12(v13)
    var v16: Double = v1
    v16 = v8
    var v12: Double = v16
    v12 = v16
    let v79: Double = f67(v12)
    var v60: Double = v79
    return v60
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]], p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
