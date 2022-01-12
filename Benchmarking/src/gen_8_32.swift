  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v5: [[s0]] = v0
    var v8: [[s0]] = v5
    let v9: [[[s0]]] = [v8, v5]
    let v2: [s0] = v0[1]
    let v3: [[s0]] = v9[0]
    v5[1] = v2
    let v15: [s0] = v3[2]
    let v13: s0 = v15[0]
    let v11: [[Double]] = v13.p1
    let v21: [Double] = v11[0]
    let v68: Double = v21[0]
    v8[1] = v2
    v5[1] = v15
    return v68
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
