package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrophyFill: ImageVector
    get() {
        if (_TrophyFill != null) {
            return _TrophyFill!!
        }
        _TrophyFill = ImageVector.Builder(
            name = "Filled.TrophyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 64f)
                horizontalLineTo(208f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(64f)
                horizontalLineTo(24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 80f)
                verticalLineTo(96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(3.65f)
                arcTo(80.13f, 80.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 191.61f)
                verticalLineTo(216f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(136f)
                verticalLineTo(191.58f)
                curveToRelative(31.94f, -3.23f, 58.44f, -25.64f, 68.08f, -55.58f)
                horizontalLineTo(208f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                verticalLineTo(80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 64f)
                close()
                moveTo(48f, 120f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 96f)
                verticalLineTo(80f)
                horizontalLineTo(48f)
                verticalLineToRelative(32f)
                quadToRelative(0f, 4f, 0.39f, 8f)
                close()
                moveTo(232f, 96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(81.81f, 81.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -8.9f)
                verticalLineTo(80f)
                horizontalLineToRelative(24f)
                close()
            }
        }.build()

        return _TrophyFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrophyFill: ImageVector? = null
