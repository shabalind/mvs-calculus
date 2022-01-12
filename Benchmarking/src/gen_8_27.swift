  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  func f17(_ v0: [s1]) -> [s1] {
    let v3: s1 = v0[1]
    let v5: s1 = v0[1]
    let v4: [s0] = v5.p0
    let v9: [s0] = v3.p0
    let v22: s1 = s1(p0: v9)
    var v77: [s1] = v0
    var v78: s1 = v22
    v78.p0 = v4
    v77[1] = v78
    return v77
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v6: [s1] = f17(v0)
    let v8: s1 = v6[0]
    let v7: [s0] = v8.p0
    let v11: [s0] = v8.p0
    let v13: s0 = v7[2]
    let v14: [[Double]] = v13.p1
    let v33: s0 = v11[2]
    let v73: [Double] = v14[0]
    let v47: [[Double]] = v33.p0
    let v145: Double = v73[0]
    var v102: [[Double]] = v47
    let v96: [Double] = v102[1]
    let v211: Double = v96[0]
    let v109: Double = v211 - v145
    return v109
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]), s1(p0: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
