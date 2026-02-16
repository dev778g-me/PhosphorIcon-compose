package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HexagonFill: ImageVector
    get() {
        if (_HexagonFill != null) {
            return _HexagonFill!!
        }
        _HexagonFill = ImageVector.Builder(
            name = "Filled.HexagonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.32f, 14f)
                lineToRelative(-88f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.36f, 0f)
                lineToRelative(-88f, -48.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.32f, -14f)
                verticalLineTo(80.18f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.32f, -14f)
                lineToRelative(88f, -48.17f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.36f, 0f)
                lineToRelative(88f, 48.17f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 80.18f)
                close()
            }
        }.build()

        return _HexagonFill!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonFill: ImageVector? = null
