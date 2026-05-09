package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CampfireThin: ImageVector
    get() {
        if (_CampfireThin != null) {
            return _CampfireThin!!
        }
        _CampfireThin = ImageVector.Builder(
            name = "Thin.CampfireThin",
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
                moveTo(40f, 168f)
                lineTo(216f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 168f)
                lineTo(40f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 136f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                curveToRelative(0f, -24f, 24f, -40f, 24f, -40f)
                reflectiveCurveTo(152f, 112f, 152f, 136f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 108f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -104f, 0f)
                curveToRelative(0f, -44f, 52f, -76f, 52f, -76f)
                reflectiveCurveTo(180f, 64f, 180f, 108f)
                close()
            }
        }.build()

        return _CampfireThin!!
    }

@Suppress("ObjectPropertyName")
private var _CampfireThin: ImageVector? = null
