package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberThreeFill: ImageVector
    get() {
        if (_NumberThreeFill != null) {
            return _NumberThreeFill!!
        }
        _NumberThreeFill = ImageVector.Builder(
            name = "Filled.NumberThreeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                horizontalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(124f, 192f)
                arcToRelative(43.85f, 43.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -34.22f, -16.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.44f, -10.06f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 126f, 120.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.58f, -13.1f)
                lineToRelative(22.48f, -27f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.15f, 13.12f)
                lineToRelative(-25.23f, 30.27f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 192f)
                close()
            }
        }.build()

        return _NumberThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberThreeFill: ImageVector? = null
