package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowBendRightUpDuotone: ImageVector
    get() {
        if (_ArrowBendRightUpDuotone != null) {
            return _ArrowBendRightUpDuotone!!
        }
        _ArrowBendRightUpDuotone = ImageVector.Builder(
            name = "Duotone.ArrowBendRightUpDuotone",
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
                moveTo(104f, 80f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
                lineToRelative(-96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 80f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
                lineToRelative(-96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, -96f)
                verticalLineTo(80f)
            }
        }.build()

        return _ArrowBendRightUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendRightUpDuotone: ImageVector? = null
