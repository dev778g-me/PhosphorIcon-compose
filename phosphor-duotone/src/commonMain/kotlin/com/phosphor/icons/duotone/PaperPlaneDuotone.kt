package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PaperPlaneDuotone: ImageVector
    get() {
        if (_PaperPlaneDuotone != null) {
            return _PaperPlaneDuotone!!
        }
        _PaperPlaneDuotone = ImageVector.Builder(
            name = "Duotone.PaperPlaneDuotone",
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
                moveTo(128f, 184f)
                lineToRelative(93.28f, 31.51f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231f, 204.07f)
                lineToRelative(-96.09f, -168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, 0f)
                lineToRelative(-95.85f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.67f, 11.44f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                lineTo(128f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 184f)
                lineToRelative(93.28f, 31.51f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231f, 204.07f)
                lineToRelative(-96.09f, -168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, 0f)
                lineToRelative(-95.85f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.67f, 11.44f)
                close()
            }
        }.build()

        return _PaperPlaneDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlaneDuotone: ImageVector? = null
