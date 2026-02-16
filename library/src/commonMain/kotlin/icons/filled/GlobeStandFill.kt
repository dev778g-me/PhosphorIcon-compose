package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GlobeStandFill: ImageVector
    get() {
        if (_GlobeStandFill != null) {
            return _GlobeStandFill!!
        }
        _GlobeStandFill = ImageVector.Builder(
            name = "Filled.GlobeStandFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(56f, 104f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 80f)
                arcTo(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 104f)
                close()
                moveTo(202.46f, 173.28f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.72f, 37.54f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 55.18f, 26.46f)
                arcTo(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 215.71f)
                lineTo(128f, 232f)
                lineTo(104f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(144f, 232f)
                lineTo(144f, 215.72f)
                arcToRelative(111.21f, 111.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 69.54f, -30.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.08f, -11.54f)
                close()
            }
        }.build()

        return _GlobeStandFill!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeStandFill: ImageVector? = null
