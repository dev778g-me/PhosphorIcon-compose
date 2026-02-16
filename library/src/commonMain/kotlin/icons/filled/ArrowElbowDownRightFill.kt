package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowElbowDownRightFill: ImageVector
    get() {
        if (_ArrowElbowDownRightFill != null) {
            return _ArrowElbowDownRightFill!!
        }
        _ArrowElbowDownRightFill = ImageVector.Builder(
            name = "Filled.ArrowElbowDownRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.66f, 181.66f)
                lineToRelative(-48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 224f)
                verticalLineTo(184f)
                horizontalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineTo(168f)
                horizontalLineToRelative(80f)
                verticalLineTo(128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.66f, 181.66f)
                close()
            }
        }.build()

        return _ArrowElbowDownRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowDownRightFill: ImageVector? = null
