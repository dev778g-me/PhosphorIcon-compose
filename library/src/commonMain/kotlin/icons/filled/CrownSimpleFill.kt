package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CrownSimpleFill: ImageVector
    get() {
        if (_CrownSimpleFill != null) {
            return _CrownSimpleFill!!
        }
        _CrownSimpleFill = ImageVector.Builder(
            name = "Filled.CrownSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.75f, 90.81f)
                curveToRelative(0f, 0.11f, 0f, 0.21f, -0.07f, 0.32f)
                lineTo(217f, 195f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.72f, 13f)
                horizontalLineTo(54.71f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39f, 195f)
                lineTo(16.32f, 91.13f)
                curveToRelative(0f, -0.11f, -0.05f, -0.21f, -0.07f, -0.32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 77.39f)
                lineToRelative(33.67f, 36.29f)
                lineToRelative(35.8f, -80.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.1f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.06f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.1f)
                lineToRelative(35.8f, 80.29f)
                lineTo(212f, 77.39f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.71f, 13.42f)
                close()
            }
        }.build()

        return _CrownSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _CrownSimpleFill: ImageVector? = null
