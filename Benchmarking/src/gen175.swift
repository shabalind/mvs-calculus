  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f12(_ v0: Double) -> Double {
    var v2: Double = v0
    var v1: Double = v0
    var v23: Double = v2
    var v15: Double = v1
    var v17: Double = v15
    var v16: Double = v0
    var v22: Double = v17
    var v19: Double = v16
    v19 = v22
    var v24: Double = v23
    v15 = v24
    var v51: Double = v19
    var v40: Double = v51
    return v40
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v4: Double = v1 + v1
    let v3: Double = f12(v1)
    let v2: Double = f12(v4)
    let v12: Double = v2 / v3
    var v14: Double = v3
    var v16: Double = v4
    var v23: Double = v14
    let v29: Double = v2 - v16
    v14 = v12
    var v261: Double = v29
    let v253: Double = v261 * v23
    return v253
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]]
    let v1: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
