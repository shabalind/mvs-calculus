  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: Double
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
    var p2: s0
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s2, _ v2: [s0], _ v3: Double) -> Double {
    let v5: [s0] = v1.p0
    let v14: s0 = v5[0]
    let v20: s0 = v5[0]
    let v29: [[Double]] = v20.p1
    let v31: [Double] = v29[1]
    let v52: Double = v31[0]
    let v53: [[Double]] = v14.p0
    let v77: [Double] = v53[0]
    let v239: Double = v77[0]
    let v259: Double = v52 / v239
    return v259
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]
    let v1: s2 = s2(p0: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p1: 16.0), p2: s0(p0: [[17.0]], p1: [[18.0], [19.0], [20.0]]))
    let v2: [s0] = [s0(p0: [[21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0]], p1: [[26.0], [27.0], [28.0]]), s0(p0: [[29.0]], p1: [[30.0], [31.0], [32.0]])]
    let v3: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
