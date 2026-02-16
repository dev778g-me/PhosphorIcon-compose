package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LetterCircleVFill: ImageVector
    get() {
        if (_LetterCircleVFill != null) {
            return _LetterCircleVFill!!
        }
        _LetterCircleVFill = ImageVector.Builder(
            name = "Filled.LetterCircleVFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(167.43f, 99f)
                lineTo(135.43f, 179f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.86f, 0f)
                lineToRelative(-32f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.43f, 93f)
                lineTo(128f, 154.46f)
                lineTo(152.57f, 93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 167.43f, 99f)
                close()
            }
        }.build()

        return _LetterCircleVFill!!
    }

@Suppress("ObjectPropertyName")
private var _LetterCircleVFill: ImageVector? = null
