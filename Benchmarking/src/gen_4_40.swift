  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v3: [Double] = [v1, v1, v1, v1, v1, v1]
    let v7: Double = v3[3]
    var v4: Double = v7
    let v10: Double = v4 + v7
    let v6: Double = v3[5]
    v4 = v6
    let v8: Double = v3[4]
    let v68: Double = v8 + v1
    var v163: Double = v68
    let v133: Double = v10 - v68
    let v285: Double = v163 + v133
    return v285
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0]], p3: [[7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0], [12.0]], p2: [[13.0], [14.0]], p3: [[15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0], [20.0]], p2: [[21.0], [22.0]], p3: [[23.0]])], p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0], [28.0]], p2: [[29.0], [30.0]], p3: [[31.0]])])
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
