  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v2: Double = v1
    var v3: Double = v1
    v3 = v2
    var v22: Double = v3
    let v31: Double = v1 / v1
    let v30: Double = v31 * v31
    var v27: Double = v31
    let v37: Double = v22 * v30
    let v178: [Double] = [v1, v3, v2, v31, v37, v37, v27]
    let v81: Double = v178[1]
    return v81
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
