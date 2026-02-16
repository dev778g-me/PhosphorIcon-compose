package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.StackThin: ImageVector
    get() {
        if (_StackThin != null) {
            return _StackThin!!
        }
        _StackThin = ImageVector.Builder(
            name = "Thin.StackThin",
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
                moveTo(32f, 176f)
                lineToRelative(96f, 56f)
                lineToRelative(96f, -56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 128f)
                lineToRelative(96f, 56f)
                lineToRelative(96f, -56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 80f)
                lineToRelative(96f, 56f)
                lineToRelative(96f, -56f)
                lineToRelative(-96f, -56f)
                lineToRelative(-96f, 56f)
                close()
            }
        }.build()

        return _StackThin!!
    }

@Suppress("ObjectPropertyName")
private var _StackThin: ImageVector? = null
