  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v6: [[Double]] = v0.p2
    let v4: [Double] = v6[1]
    let v11: Double = v4[0]
    let v13: Double = v4[0]
    let v18: [Double] = [v11, v1]
    let v23: [Double] = v6[0]
    let v10: Double = v18[1]
    let v35: Double = v23[0]
    let v74: Double = v13 + v10
    let v67: Double = v74 - v35
    return v67
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0]])
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
