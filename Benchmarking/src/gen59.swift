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
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v18: Double = v1
    let v17: [Double] = [v1, v18, v1, v1]
    var v28: [Double] = v17
    let v34: Double = v28[2]
    let v31: Double = v17[2]
    v28[3] = v31
    var v57: Double = v34
    let v29: Double = v28[3]
    let v103: Double = v28[2]
    let v54: Double = v31 - v103
    v28[1] = v54
    let v84: Double = v57 - v29
    return v84
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]))
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
