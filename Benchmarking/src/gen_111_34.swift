  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  func f16(_ v0: [s0], _ v1: Double) -> Double {
    var v35: Double = v1
    var v65: Double = v35
    return v65
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    let v16: Double = f16(v0, v2)
    let v19: Double = f16(v0, v2)
    let v27: Double = f16(v0, v16)
    let v130: Double = v19 - v27
    var v82: Double = v130
    return v82
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]
    let v1: s1 = s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: [[s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])]])
    let v2: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
