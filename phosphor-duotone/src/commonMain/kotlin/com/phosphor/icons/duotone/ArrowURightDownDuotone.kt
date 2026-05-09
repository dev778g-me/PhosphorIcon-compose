package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowURightDownDuotone: ImageVector
    get() {
        if (_ArrowURightDownDuotone != null) {
            return _ArrowURightDownDuotone!!
        }
        _ArrowURightDownDuotone = ImageVector.Builder(
            name = "Duotone.ArrowURightDownDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(120f, 176f)
                lineToRelative(48f, 48f)
                lineToRelative(48f, -48f)
                lineToRelative(-96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 176f)
                lineToRelative(48f, 48f)
                lineToRelative(48f, -48f)
                lineToRelative(-96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 176f)
                verticalLineTo(88f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                verticalLineToRelative(88f)
            }
        }.build()

        return _ArrowURightDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightDownDuotone: ImageVector? = null
