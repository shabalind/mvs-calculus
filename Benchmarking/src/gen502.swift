  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v9: [Double] = [v1, v1, v1, v1]
    let v2: Double = v9[0]
    var v18: Double = v2
    var v16: [Double] = v9
    v16[1] = v1
    v18 = v2
    let v33: Double = v16[3]
    v16[0] = v18
    var v32: Double = v33
    v16[3] = v33
    v18 = v33
    return v32
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])]]
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
