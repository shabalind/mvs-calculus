  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    var v4: Double = v1
    var v6: [s1] = v0
    let v7: s1 = v0[0]
    let v3: s1 = v6[0]
    let v2: s0 = v3.p1
    let v15: [[Double]] = v2.p0
    let v36: Double = v4 + v1
    v6[0] = v7
    v6[0] = v3
    let v35: [Double] = v15[0]
    v6[0] = v7
    let v43: [Double] = [v1, v1, v36, v36, v4]
    v6[0] = v7
    let v29: Double = v35[0]
    let v41: Double = v43[4]
    let v50: [Double] = [v29, v29, v1, v41, v36]
    var v69: [Double] = v50
    let v82: Double = v69[3]
    return v82
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])]], p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]))]
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
