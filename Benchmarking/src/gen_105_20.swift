  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  func f59(_ v0: Double) -> Double {
    var v4: Double = v0
    var v1: Double = v0
    var v18: Double = v4
    var v21: Double = v1
    let v40: [Double] = [v18]
    var v22: [Double] = v40
    var v33: [Double] = v22
    v22[0] = v21
    let v39: Double = v33[0]
    return v39
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v5: Double = v1
    v5 = v1
    v5 = v1
    let v16: Double = f59(v5)
    var v35: Double = v16
    let v54: Double = v35 - v35
    v35 = v16
    v5 = v35
    let v140: Double = v54 - v1
    return v140
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [[s0(p0: [[2.0]], p1: [[3.0]])], [s0(p0: [[4.0]], p1: [[5.0]])]])
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
