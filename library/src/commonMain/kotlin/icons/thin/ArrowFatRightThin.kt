package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.ArrowFatRightThin: ImageVector
    get() {
        if (_ArrowFatRightThin != null) {
            return _ArrowFatRightThin!!
        }
        _ArrowFatRightThin = ImageVector.Builder(
            name = "Thin.ArrowFatRightThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 32f)
                lineToRelative(96f, 96f)
                lineToRelative(-96f, 96f)
                verticalLineTo(176f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(88f)
                close()
            }
        }.build()

        return _ArrowFatRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatRightThin: ImageVector? = null
